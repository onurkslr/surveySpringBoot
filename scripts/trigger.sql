CREATE DEFINER=`root`@`localhost` TRIGGER `register_AFTER_INSERT` AFTER INSERT ON `register` FOR EACH ROW BEGIN
DECLARE maxScore INT;
DECLARE minScore INT;
DECLARE total DOUBLE;
SET maxScore = (SELECT COUNT(*)FROM survey.register WHERE score IN (9,10) AND topic_id= NEW.topic_id);
SET minScore = (SELECT COUNT(*)FROM survey.register WHERE topic_id= NEW.topic_id AND score BETWEEN 0 AND 6);
SET total = ((maxScore - minScore) / (SELECT COUNT(*) FROM survey.register WHERE topic_id = NEW.topic_id)) * 100;
UPDATE topic SET npm = total WHERE topic_id = NEW.topic_id;

END