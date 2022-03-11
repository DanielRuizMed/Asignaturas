insert into asignaturas (id, curso, descripcion, nombre)
select 1, 1, 'Aprendiendo Hola mundo', 'MP' from dual where not exists (select 1 from asignaturas where id = 1);

insert into asignaturas (id, curso, descripcion, nombre)
select 2, 2, 'Aprendiendo Objetos', 'PDOO' from dual where not exists (select 1 from asignaturas where id = 2);