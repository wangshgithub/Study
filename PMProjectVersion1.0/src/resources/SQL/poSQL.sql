drop table Requirement;
create table Requirement  (
   RequirementId        NUMBER(20)                      not null,
   RequirementNo        VARCHAR2(10),
   TaskType             VARCHAR2(5),
   SeqNo                VARCHAR2(10),
   Department           VARCHAR2(20),
   Introducer           VARCHAR2(10),
   ITPrinclpal          VARCHAR2(10),
   EstimateWork         NUMBER(10,2),
   RequirementDescribe  VARCHAR2(500),
   Module               VARCHAR2(10),
   DemandPriority       VARCHAR2(10),
   IfUrgency            VARCHAR2(5),
   SettleMonth          VARCHAR2(10),
   IfSettle             VARCHAR2(5),
   IfStartWork          VARCHAR2(5),
   IfLineList           VARCHAR2(5),
   IfDatmust            VARCHAR2(20),
   SumWorkLoad          NUMBER(10,2),
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_REQUIREMENT primary key (RequirementId)
);

comment on column Requirement.TaskType is
'Req为需求;BUG为bug';


drop table RequirementEstimatedate;
create table RequirementEstimatedate  (
   RequirementOldPlanId NUMBER(20)                      not null,
   RequirementId        NUMBER(20),
   EstimateAnalysisStartDate DATE,
   EstimateAnalysisEndDate DATE,
   EstimateDevelopStartDate DATE,
   EstimateDeveloeEndDate DATE,
   EstimateDatTestStartDate DATE,
   EstimateDatTestEndDate DATE,
   EstimateUatTestStartDate DATE,
   EstimateUatTestEndDate DATE,
   EstimateFinishDate   DATE,
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_REQUIREMENTESTIMATEDATE primary key (RequirementOldPlanId)
);
comment on column RequirementEstimatedate.RequirementId is
'对应需求表主键';


drop table RequirementInFactdate;
create table RequirementInFactdate  (
   RequirementNewPlanID NUMBER(20)                      not null,
   RequirementId        NUMBER(20),
   InFactAnalysisStartDate DATE,
   InFactAnalysisEndDate DATE,
   InFactDevelopStartDate DATE,
   InFactDevelopEndDate DATE,
   InFactDatTestStartDate DATE,
   InFactDatTestEndDate DATE,
   InFactUatTestStartDate DATE,
   InFactUatTestEndDate DATE,
   InFactFinishDate     DATE,
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_REQUIREMENTINFACTDATE primary key (RequirementNewPlanID)
);
comment on column RequirementInFactdate.RequirementId is
'对应需求表主键';


drop table EstimateWorkLoad;
create table EstimateWorkLoad  (
   RequireOldWorkID     NUMBER(20)                      not null,
   RequirementId        NUMBER(20),
   EstimateAnalysisWorkLoad NUMBER(10,2),
   EstimateDevelopWorkLoad NUMBER(10,2),
   EstimateTestWorkLoad NUMBER(10,2),
   EstimateSumWorkLoad  NUMBER(10,2),
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_ESTIMATEWORKLOAD primary key (RequireOldWorkID)
);
comment on column EstimateWorkLoad.RequirementId is
'参照需求表的主键';


drop table InFactWorkLoad;
create table InFactWorkLoad  (
   RequireNewWorkID     NUMBER(20)                      not null,
   RequirementId        NUMBER(20),
   InFactAnalysisWorkLoad NUMBER(10,2),
   InFactDevelopWorkLoad NUMBER(10,2),
   InFactTestWorkLoad   NUMBER(10,2),
   InFactSumWorkLoad    NUMBER(10,2),
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_INFACTWORKLOAD primary key (RequireNewWorkID)
);
comment on column InFactWorkLoad.RequirementId is
'参照需求表的主键';


drop table RequirementOldWorkDetail;
comment on column RequirementOldWorkDetail.RequirementWorkID is
'关联需求现工作量表的主键';

comment on column RequirementOldWorkDetail.FunctionModule is
'A-分析;D-开发;T-测试;C-配合测试;O-其他';


drop table RequirementNewWorkDetail;
create table RequirementWorkDetail  (
   RequireNewWorkDetailID NUMBER(20),
   RequirementWorkID    NUMBER(20),
   FunctionModule       VARCHAR2(10),
   FunctionRemark       VARCHAR2(500),
   InFactFunctionWorkLoad NUMBER(10,2),
   FunctionPrincipal    VARCHAR2(20),
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8)
);

comment on column RequirementNewWorkDetail.RequirementWorkID is
'关联需求现工作量表的主键';

comment on column RequirementNewWorkDetail.FunctionModule is
'A-分析;D-开发;T-测试;C-配合测试;O-其他';


drop table RequirementPople;
create table RequirementPople  (
   RequirementRelationID NUMBER(20)                      not null,
   RequirementId        NUMBER(20),
   RequirementState     VARCHAR2(10),
   StateRemark          VARCHAR2(200),
   Principalaccount     VARCHAR2(20),
   RequireAnalysisaccount VARCHAR2(20),
   RequireDevelopaccount VARCHAR2(20),
   RequireTestaccount   VARCHAR2(20),
   MakeDate             DATE,
   MakeTime             VARCHAR2(8),
   ModifyDate           DATE,
   ModifyTime           VARCHAR2(8),
   constraint PK_REQUIREMENTPOPLE primary key (RequirementRelationID)
);

comment on column RequirementPople.RequirementId is
'关联需求表主键';


drop sequence SEQ_REQUIREMENT_ID;
create sequence SEQ_REQUIREMENT_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_RequirementEstimatedate_ID;
create sequence SEQ_RequirementEstimatedate_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_RequirementInFactdate_ID;
create sequence SEQ_RequirementInFactdate_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_EstimateWorkLoad_ID;
create sequence SEQ_EstimateWorkLoad_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_InFactWorkLoad_ID;
create sequence SEQ_InFactWorkLoad_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_RequirementPople_ID;
create sequence SEQ_RequirementPople_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_RequirementOldDetail_ID;
create sequence SEQ_RequirementOldDetail_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;

drop sequence SEQ_RequirementNewDetail_ID;
create sequence SEQ_RequirementNewDetail_ID
minvalue 1
maxvalue 9999999999999999
start with 1
increment by 1
cache 2;