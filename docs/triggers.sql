-- Trigger para inserir um empregado automaticamente no sindicato!

create or replace function insere_empregado_sindicato() returns TRIGGER as
$$
BEGIN
	insert into sindicato(idempregado) values (new.idempregado);
	return new;
END;
$$
language plpgsql;

create TRIGGER insere_empregado_sindicato after insert on empregado for each row execute procedure insere_empregado_sindicato();


-- Trigger para criar um empregado quando for adicionado um controlador ou tecnico novo.

create or replace function inc_empregado() returns TRIGGER as
$$
DECLARE
	novo_id int;
BEGIN
	insert into empregado(idempregado, nome_empregado) values(default,null) RETURNING idempregado INTO novo_id;
	new.idempregado = novo_id;
	return new;
END;
$$
language plpgsql;

create TRIGGER inc_empregado before insert on controlador for each row execute procedure inc_empregado()
create TRIGGER inc_empregado before insert on tecnico for each row execute procedure inc_empregado()


-- Trigger para verificar antes de adicionar um aviao se aquele aviao ja existe na base de dados

create or replace function busca_modelo() returns trigger as 
$$
BEGIN
	if (select idmodeloaviao from modeloaviao where idmodeloaviao = new.idmodeloaviao) > 0 then
		return new;
	else
		raise exception 'Modelo de aviao inexistente!';
	end if;
END;
$$
language plpgsql;

create TRIGGER busca_modelo before insert on aviao for each row execute procedure busca_modelo();

-- Altera a data do ultimo exame do controlador quando inserir novo exame em consultas

create or replace function alterar_data_controlador() returns TRIGGER as
$$
BEGIN
	update controlador set data_exame_recente = CURRENT_DATE where idcontrolador = new.idcontrolador;
END;
$$
language plpgsql;

create TRIGGER alterar_data_controlador after insert on consultas for each row execute procedure alterar_data_controlador();

