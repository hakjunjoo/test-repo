-- 코드를 입력하세요
SELECT DISTINCT CCC.CAR_ID FROM CAR_RENTAL_COMPANY_CAR CCC
 LEFT JOIN  CAR_RENTAL_COMPANY_RENTAL_HISTORY CCRH ON CCC.CAR_ID = CCRH.CAR_ID
 WHERE CCC.CAR_TYPE = '세단' AND CCRH.START_DATE LIKE '2022-10%'
 ORDER BY 1 DESC