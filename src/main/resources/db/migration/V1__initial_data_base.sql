create table if not exists public.users(
	ID serial,
    login character varying(20),
    password character varying(255),
    fullName character varying(20),
    name character varying(128),
    age integer,
    sex character,
    email character varying(100),
    department character varying(128),
    position character varying(100),
    description character varying(1000),
    birthDay date,
    state boolean,
    statusUser character varying(20)
);

create table if not exists public.groups(
	ID serial,
    name character varying(250),
    status bool,
    description character varying(1024)
);

create table if not exists public.projects(
    ID serial,
    name character varying(500),
    type character varying(20),
    createDate timestamp,
    description character varying(1024),
    stars integer
);

create table if not exists public.issue(
	ID serial,
    external_ID character varying(12),
    title character varying(128),
    describe character varying(2024),
    assignee_id integer,
    status integer,
    type character varying(128),
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
    name character varying(128),
    description character varying(2048),
    create_date timestamp
)

create table if not exists public.category(
	ID serial,
	name character varying(128)
);

create table if not exists public.tasks(
	ID serial,
	external_id character varying(12),
	description character varying(2048)
);
