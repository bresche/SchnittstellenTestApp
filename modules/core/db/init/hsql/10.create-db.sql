-- begin SCHNITTSTELLENTESTAPP_KAT_TELEFONARTEN
create table SCHNITTSTELLENTESTAPP_KAT_TELEFONARTEN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BEZEICHNUNG varchar(255),
    CODE varchar(255),
    --
    primary key (ID)
)^
-- end SCHNITTSTELLENTESTAPP_KAT_TELEFONARTEN
-- begin SCHNITTSTELLENTESTAPP_BETRIEBSSTAETTE
create table SCHNITTSTELLENTESTAPP_BETRIEBSSTAETTE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADRESSE varchar(255),
    TELEFONNUMMER varchar(255),
    BEZEICHNUNG varchar(255),
    --
    primary key (ID)
)^
-- end SCHNITTSTELLENTESTAPP_BETRIEBSSTAETTE
