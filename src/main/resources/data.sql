INSERT INTO test_user(first_name,last_name,email_user,password)
    VALUES ('dodo','love','dodo@gmail.com','4321') ON CONFLICT (email_user) do nothing;
INSERT INTO test_user(first_name,last_name,email_user,password)
    VALUES ('hug','vow','hug@gmail.com','1234') ON CONFLICT (email_user) do nothing;

INSERT INTO brand (description,brand,cal)
    VALUES ('food for cat','nahug food',365) ON CONFLICT (brand) do nothing;
INSERT INTO brand (description,brand,cal)
    VALUES ('good cat food','meo',360) ON CONFLICT (brand) do nothing;

INSERT INTO vaccine (name_vaccine,age_month)
    VALUES ('FPV',2) on CONFLICT (name_vaccine) do nothing;
INSERT INTO vaccine (name_vaccine,age_month)
    VALUES ('Rabbit',6) on CONFLICT (name_vaccine) do nothing;
