--------------------------------------------------------
--  File creato - giovedì-settembre-21-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CAR
--------------------------------------------------------

  CREATE TABLE "USER1"."CAR" 
   (	"ID" NUMBER, 
	"BRAND" VARCHAR2(50 BYTE), 
	"MODEL" VARCHAR2(50 BYTE), 
	"TYPE" NUMBER(2,0), 
	"PLATE" VARCHAR2(50 BYTE), 
	"SEATS" NUMBER(2,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PEOPLE
--------------------------------------------------------

  CREATE TABLE "USER1"."PEOPLE" 
   (	"ID" NUMBER, 
	"NAME" VARCHAR2(50 BYTE), 
	"SURNAME" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table RESERVATION
--------------------------------------------------------

  CREATE TABLE "USER1"."RESERVATION" 
   (	"CAR" NUMBER, 
	"PEOPLE" NUMBER, 
	"STATE" NUMBER(2,0)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Sequence CAR_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "USER1"."CAR_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence PEOPLE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "USER1"."PEOPLE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 41 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence VEHICLE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "USER1"."VEHICLE_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Index CARPK
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."CARPK" ON "USER1"."CAR" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PEOPLEPK
--------------------------------------------------------

  CREATE UNIQUE INDEX "USER1"."PEOPLEPK" ON "USER1"."PEOPLE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger BI_CAR
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "USER1"."BI_CAR" BEFORE INSERT ON USER1.CAR
	FOR EACH ROW
BEGIN
  SELECT USER1.CAR_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "USER1"."BI_CAR" ENABLE;
--------------------------------------------------------
--  DDL for Trigger BI_PEOPLE
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "USER1"."BI_PEOPLE" BEFORE INSERT ON USER1.PEOPLE
	FOR EACH ROW
BEGIN
  SELECT USER1.PEOPLE_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "USER1"."BI_PEOPLE" ENABLE;
--------------------------------------------------------
--  Constraints for Table CAR
--------------------------------------------------------

  ALTER TABLE "USER1"."CAR" ADD CONSTRAINT "CARPK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."CAR" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PEOPLE
--------------------------------------------------------

  ALTER TABLE "USER1"."PEOPLE" ADD CONSTRAINT "PEOPLEPK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USER1"."PEOPLE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table RESERVATION
--------------------------------------------------------

  ALTER TABLE "USER1"."RESERVATION" ADD CONSTRAINT "RESERVATIONFK1" FOREIGN KEY ("PEOPLE")
	  REFERENCES "USER1"."PEOPLE" ("ID") ENABLE;
  ALTER TABLE "USER1"."RESERVATION" ADD CONSTRAINT "RESERVATIONFK2" FOREIGN KEY ("CAR")
	  REFERENCES "USER1"."CAR" ("ID") ENABLE;
