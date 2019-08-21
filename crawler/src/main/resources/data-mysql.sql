insert into culture (id, culture_name) values (null, 'musical')
WHERE NOT EXISTS (
 SELECT culture_name  FROM culture
 WHERE  culture_name = 'musical'
 );

insert into culture (id, culture_name) values (null, 'concert');
insert into culture (id, culture_name) values (null, 'play');
insert into culture (id, culture_name) values (null, 'exhibition');
insert into culture (id, culture_name) values (null, 'etc');