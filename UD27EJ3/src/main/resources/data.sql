-- Inserts para cajeros
INSERT INTO cajeros (nom_apels) VALUES ('Juan Pérez');
INSERT INTO cajeros (nom_apels) VALUES ('María Rodríguez');
INSERT INTO cajeros (nom_apels) VALUES ('Carlos Gómez');
INSERT INTO cajeros (nom_apels) VALUES ('Ana López');
INSERT INTO cajeros (nom_apels) VALUES ('Pedro García');

-- Inserts para maquinas_registradoras
INSERT INTO maquinas_registradoras (piso) VALUES (1);
INSERT INTO maquinas_registradoras (piso) VALUES (2);
INSERT INTO maquinas_registradoras (piso) VALUES (3);
INSERT INTO maquinas_registradoras (piso) VALUES (4);
INSERT INTO maquinas_registradoras (piso) VALUES (5);

-- Inserts para productos
INSERT INTO productos (precio) VALUES (10);
INSERT INTO productos (precio) VALUES (20);
INSERT INTO productos (precio) VALUES (30);
INSERT INTO productos (precio) VALUES (40);
INSERT INTO productos (precio) VALUES (50);

-- Inserts para venta (tabla intermedia)
INSERT INTO ventas (cajero_id, maquina_registradora_id, producto_id) VALUES (1, 1, 1);
INSERT INTO ventas (cajero_id, maquina_registradora_id, producto_id) VALUES (2, 2, 2);
INSERT INTO ventas (cajero_id, maquina_registradora_id, producto_id) VALUES (3, 3, 3);
INSERT INTO ventas (cajero_id, maquina_registradora_id, producto_id) VALUES (4, 4, 4);
INSERT INTO ventas (cajero_id, maquina_registradora_id, producto_id) VALUES (5, 5, 5);