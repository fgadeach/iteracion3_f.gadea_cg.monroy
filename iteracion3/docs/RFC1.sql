SELECT * 
FROM AFOROCC.visitantes
WHERE visitantes.id IN (SELECT id_visitante
FROM AFOROCC.calendario_visitante_local
WHERE calendario_visitante_local.id_Local IN
(SELECT id_Local
FROM AFOROCC.local))