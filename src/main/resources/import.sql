insert into Categoria(id, nome, precoDiaria) values (1, 'Padrão', 90);
insert into Categoria(id, nome, precoDiaria) values (2, 'Superior', 140);
insert into Categoria(id, nome, precoDiaria) values (3, 'Luxo', 340);

insert into Quarto(id, numero, categoria_id) values (1, '1A', 1);
insert into Quarto(id, numero, categoria_id) values (2, '1B', 1);
insert into Quarto(id, numero, categoria_id) values (3, '1C', 2);
insert into Quarto(id, numero, categoria_id) values (4, '1D', 2);
insert into Quarto(id, numero, categoria_id) values (5, '2A', 1);
insert into Quarto(id, numero, categoria_id) values (6, '2B', 1);
insert into Quarto(id, numero, categoria_id) values (7, '2C', 2);
insert into Quarto(id, numero, categoria_id) values (8, '2D', 2);
insert into Quarto(id, numero, categoria_id) values (9, 'PRES1', 3);
insert into Quarto(id, numero, categoria_id) values (10, 'PRES2', 3);

-- Carga de Hóspedes
-- insert into Hospede(id, nome, dataNascimento, nacionalidade) values (1, 'Eric Evans', '1961-04-04', 'Americano');
-- insert into Hospede(id, nome, dataNascimento, nacionalidade) values (2, 'Martin Fowler', '1944-01-03', 'Americano');
-- insert into Hospede(id, nome, dataNascimento, nacionalidade) values (3, 'Jimmy Nilsson', '1958-08-04', 'Sueco');

-- Carga de Reservas
-- insert into Reserva(id, hospede_id, quarto_id, dataCheckin, dataCheckout) values (1, 3, 10, '2009-09-18 00:00:00.000', '2009-09-19 23:59:59.999');
