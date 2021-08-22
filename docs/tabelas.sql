create table modeloAviao(
	idModeloAviao serial not null primary key,
	capacidade int,
	peso numeric
);

create table aviao(
	idAviao serial not null primary key,
	numRegistro int,
	idModeloAviao int not null,
	foreign key(idModeloAviao) REFERENCES modeloAviao(idModeloAviao)
);

create table empregado(
	idEmpregado serial not null primary key,
	nome_empregado varchar(200)
);

create table controlador(
	idControlador serial not null primary key,
	data_exame_recente date,
	idEmpregado int not null,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table tecnico(
	idTecnico serial not null primary key,
	num_matricula int,
	endereco varchar(200),
	num_telefone varchar(50),
	salario numeric,
	idEmpregado int not null,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table especialidade(
	idEspecialidade serial primary key not null,
	idTecnico int,
	idAviao int,
	FOREIGN KEY(idTecnico) REFERENCES tecnico(idTecnico),
	FOREIGN KEY(idAviao) REFERENCES aviao(idAviao)
);

create table consultas(
	idConsultas serial not null primary key,
	idControlador int not null,
	FOREIGN KEY(idControlador) REFERENCES controlador(idControlador)
);

create table sindicato(
	nroaMembro serial not null primary key,
	idEmpregado int not null,
	FOREIGN KEY(idEmpregado) REFERENCES empregado(idEmpregado)
);

create table testes(
	idTest serial not null primary key,
	nome varchar(200),
	pontuacao_max numeric,
	idAviao int not null,
	FOREIGN KEY(idAviao) REFERENCES aviao(idAviao)
);

create table teste_realizado(
	idTesteRealizado serial not null primary key,
	data_realizacao date,
	hrs_gastas time,
	idTecnico int,
	idTest int,
	FOREIGN KEY(idTest) REFERENCES testes(idTest),
	FOREIGN KEY(idTecnico) REFERENCES tecnico(idTecnico)
);
