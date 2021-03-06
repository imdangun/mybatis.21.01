-- sqlplus -s system/oracle < mybatis.sql

drop user mybatis cascade;

create user mybatis identified by mybatis default tablespace users;
grant connect, resource to mybatis;

create table mybatis.users (
    user_id number(2),
    user_name varchar2(12),
    reg_date date);

create table mybatis.addresses (
    user_id number(2),
    address  varchar2(30));

create table mybatis.posts (
    post_id number(3),
    post_title varchar2(60),
    post_content varchar2(120),
    user_id number(2));

alter table mybatis.users add constraint users_userid_pk primary key(user_id);
alter table mybatis.addresses add constraint addresses_userid_pk primary key(user_id);
alter table mybatis.posts add constraint posts_postid_pk primary key(post_id);

alter table mybatis.addresses add constraint addresses_userid_fk foreign key(user_id)
    references mybatis.users(user_id);
alter table mybatis.posts add constraint posts_userid_fk foreign key(user_id)
    references mybatis.users(user_id);

insert into mybatis.users values (1, 'john', to_date('2025-05-05', 'yyyy-MM-dd'));
insert into mybatis.users values (2, 'terry', to_date('2025-05-15', 'yyyy-MM-dd'));
insert into mybatis.addresses values (1, '����� ������');
insert into mybatis.addresses values (2, '������ �д籸');
insert into mybatis.posts values (101, '���', '�ʿ� ���� �������', 1);
insert into mybatis.posts values (102, '����', '�ʿ� ���� �������', 1);
insert into mybatis.posts values (201, '��ġ', '�װ� �־�� ���� ����', 2);
insert into mybatis.posts values (202, '�����', '���г�������� ���� �����̴�.', 2);
insert into mybatis.posts values (203, '���Ҷ�', '�װ� �׸���.', 2);

commit;
