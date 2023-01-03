INSERT INTO test_user(first_name,last_name,email_user,password)
    VALUES ('dodo','love','dodo@gmail.com','4321'),
           ('hug','vow','hug@gmail.com','1234');

INSERT INTO cat (name,age_year,age_month,weight,gender,id_u,id_food)
    VALUES ('casuya',1,2,2,'male',1,1),
           ('preto',3,6,5,'male',2,2);

INSERT INTO brand (description,brand,cal)
    VALUES ('food for cat','nahug food',365),
           ('good cat food','meo',360);

INSERT INTO vaccine (name_vaccine)
    VALUES ('FPV'),
           ('Rabbit');

INSERT INTO phase (age_month,next_time,count_vaccine,vaccine_id,phase)
    VALUES (2,1,3,1,1),
           (2,12,0,1,2),
           (12,12,0,2,1);