INSERT INTO `users` (username, password, active, first_name, last_name, email) VALUES ('verdugox','$2a$10$1idtuWKG4LKQYAuM.JaBA.4PjxzTtEfbHFHnEWfNp8Byk77zAldyW',1, 'Luis', 'Acuna','luisandresverdugox@gmail.com');
INSERT INTO `users` (username, password, active, first_name, last_name, email) VALUES ('admin','$2a$10$GXhIAoBFqokr/OXCVr.seupJ3l29dEeDtrtGjNguRAOm6LP5OuM.m',1, 'Luis', 'Acuna','luisandresverdugox@icloud.com');

INSERT INTO `roles` (name) VALUES ('ROLE_USER');
INSERT INTO `roles` (name) VALUES ('ROLE_ADMIN');

INSERT INTO `users_roles` (user_id, role_id) VALUES (1, 1);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2, 2);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2, 1);