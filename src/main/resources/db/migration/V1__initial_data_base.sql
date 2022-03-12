create table if not exists public.users(
	ID serial,
    login varchar(20),
    password varchar(255),
    fullName varchar(20),
    name varchar(128),
    age integer,
    sex character,
    email varchar(100),
    department varchar(128),
    position varchar(100),
    description varchar(1000),
    birthDay date,
    state boolean,
    statusUser varchar(20)
);

create table if not exists public.groups(
	ID serial,
    name varchar(250),
    status bool,
    description varchar(1024)
);

create table if not exists public.projects(
    ID serial,
    name varchar(500),
    type varchar(20),
    createDate timestamp,
    description varchar(1024),
    rating integer
);

create table if not exists public.issue(
	ID serial,
    external_ID varchar(12),
    title varchar(128),
    describe varchar(2024),
    assignee_id integer,
    status integer,
    type varchar(128),
    priority integer,
    create_date timestamp,
	close_date timestamp,
    last_modify_date timestamp,
    project_id integer,
	version_id integer,
	category_id integer
);

create table if not exists public.version(
	ID serial,
    name varchar(128),
    description varchar(2048),
    create_date timestamp
);

create table if not exists public.category(
	ID serial,
	name varchar(128)
);

create table if not exists public.tasks(
	ID serial,
	external_id varchar(12),
	description varchar(2048)
);
