create table modeloAviao(
	codModelo varchar(100) not null primary key,
	capacidade int,
	peso numeric
);

create table aviao(
	num_registro serial not null primary key,
	codModelo varchar(100) not null,
	foreign key(codModelo) REFERENCES modeloAviao(codModelo)
);

create table empregado(
	idEmpregado serial not null primary key,
	nome_empregado varchar(200)
);

create table controlador(
	idEmpregado serial primary key,
	data_exame_recente date,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table tecnico(
	idEmpregado serial primary key,
	num_matricula int,
	endereco varchar(200),
	num_telefone varchar(50),
	salario numeric,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table especialidade(
	idEspecialidade serial primary key not null,
	idEmpregado int,
	codModelo varchar(100),
	FOREIGN KEY(idEmpregado) REFERENCES tecnico(idEmpregado),
	FOREIGN KEY(codModelo) REFERENCES modeloAviao(codModelo)
);

create table sindicato(
	nroaMembro serial not null primary key,
	idEmpregado int not null,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table teste(
	nroa serial not null primary key,
	nome varchar(200),
	pontuacao_max numeric,
	num_registro int not null,
	FOREIGN KEY(num_registro) REFERENCES aviao(num_registro)
);

create table testeRealizado(
	idTesteRealizado serial not null primary key,
	data_realizacao date,
	hrs_gastas time,
	idEmpregado int,
	nroa int,
	FOREIGN KEY(nroa) REFERENCES teste(nroa),
	FOREIGN KEY(idEmpregado) REFERENCES tecnico(idEmpregado)
);

create or replace function geraDadosModeloAviao() returns void as
$$
declare 
	vcapacidade int default 0;
	vpeso numeric default 0.0;
	vcodmodelo varchar(100)[] := '{''DC-10'',''A320'',''Boing 767'',''Boing 747'',''A350 XWB'',''A380''}';
begin
	for cont in 1..6 loop
	  vcapacidade := random()*(1000-1)+1;
	  vpeso := random()*(100-18)+18;
      insert into modeloaviao (codmodelo,capacidade, peso) values (vcodmodelo[cont],vcapacidade,vpeso); 
   end loop;
end;
$$
language plpgsql

