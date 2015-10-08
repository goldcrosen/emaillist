select email_list_no_seq.nextval from dual;
select email_list_no_seq.currval from dual;

insert
  into email_list 
values ( email_list_no_seq.nextval, '안', '대혁', 'kickscar@gmail.com' );

insert
  into email_list 
values ( email_list_no_seq.nextval, '안', '대혁2', 'kickscar2@gmail.com' );

delete 
  from email_list
 where no = 7; 
  
commit;

select * from email_list order by no desc;
