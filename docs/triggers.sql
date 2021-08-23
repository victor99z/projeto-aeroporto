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


