-- 코드를 입력하세요
SELECT FP.PRODUCT_ID,
       FP.PRODUCT_NAME,
       FP.PRICE * SUM(FO.AMOUNT) TOTAL_SALES
    FROM FOOD_PRODUCT FP
    LEFT JOIN FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID
    WHERE MONTH(PRODUCE_DATE) = 5
    GROUP BY 1
    ORDER BY 3 DESC, 1