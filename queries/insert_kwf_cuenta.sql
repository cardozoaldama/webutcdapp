INSERT INTO public.kwf_cuenta(
	id_cuenta, cuenta_nombre, usuario_creacion, usuario_modificacion, fecha_creacion, ultima_modificacion, uuid)
	VALUES 
	(1, 'Cuenta1', 'john', 'jane', '2023-05-01', '2023-05-10', 'abc123'),
	(2, 'Cuenta2', 'alice', 'bob', '2023-04-15', '2023-04-25', 'def456'),
	(3, 'Cuenta3', 'mike', 'laura', '2023-05-05', '2023-05-15', 'ghi789'),
	(4, 'Cuenta4', 'chris', 'emily', '2023-04-20', '2023-04-30', 'jkl012'),
	(5, 'Cuenta5', 'david', 'olivia', '2023-04-10', '2023-04-20', 'mno345');
	
SELECT * FROM kwf_cuenta;