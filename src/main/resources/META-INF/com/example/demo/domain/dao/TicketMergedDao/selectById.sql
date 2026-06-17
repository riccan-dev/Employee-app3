SELECT
    t.ticket_id,
    t.departure_date,
    t.price,
    t.seat_count,
    f.flight_no,
    f.airline_name,
    f.departure_time,
    f.arrival_time,
    dc.city_name AS departure_city_name,
    ac.city_name AS arrival_city_name
FROM
    tickets t
INNER JOIN flights f
    ON t.flight_id = f.flight_id
INNER JOIN cities dc
    ON f.departure_city_id = dc.city_id
INNER JOIN cities ac
    ON f.arrival_city_id = ac.city_id
WHERE
    t.departure_date = /* date */'2026-06-20'
AND
    ac.city_name = /* city */'大阪'
ORDER BY
    f.departure_time;