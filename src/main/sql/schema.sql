CREATE DATABASE secondKill;

use secondKill;

CREATE TABLE second_kill(
  'seckill_id' BIGINT NOT NULL AUTO_INCREMENT,
  'name' VARCHAR(120) NOT NULL,
  'number' INT NOT NULL,
  'start_time' TIMESTAMP NOT NULL,
  'end_time' TIMESTAMP NOT NULL ,
  'create_time' TIMESTAMP NOT NULL DEFAULT current_timestamp,
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='库存';

INSERT INTO second_kill (name,number,start_time,end_time)
  VALUES
    ('1000元秒杀iphone6s',100,'2017-05-24 00:00','2017-06-24 00:00'),
    ('1元秒杀iphone7s',100,'2017-05-24 00:00','2017-06-24 00:00'),
    ('100元秒杀ipad',100,'2017-05-24 00:00','2017-06-24 00:00'),
    ('300元秒杀mac book pro',100,'2017-05-24 00:00','2017-06-24 00:00');

CREATE TABLE success_kill(
  'seckill_id' BIGINT NOT NULL ,
  'user_phone' BIGINT NOT NULL ,
  'state' TINYINT NOT NULL DEFAULT -1 COMMENT '状态:-1:无效 0:成功 1:付款',
  'create_time' TIMESTAMP NOT NULL,
  PRIMARY KEY (seckill_id,user_phone),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功';

-- 连接mysql: mysql -uroot -p


