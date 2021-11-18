DROP TABLE PETSTORE CASCADE CONSTRAINTS PURGE;


create table PETSTORE (
    ID int GENERATED by default on null as IDENTITY,
    PRIMARY KEY(ID)
);
COMMENT ON TABLE PETSTORE IS 'Tabella delle Petstore';
COMMENT ON COLUMN PETSTORE.ID IS 'Identificativo Petstore';
