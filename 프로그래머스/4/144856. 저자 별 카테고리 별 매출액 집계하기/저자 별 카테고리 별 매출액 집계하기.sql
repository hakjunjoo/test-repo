-- 코드를 입력하세요
SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(B.PRICE*BS.SALES) TOTAL_SALES FROM BOOK B
    INNER JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
    INNER JOIN BOOK_SALES BS ON B.BOOK_ID = BS.BOOK_ID
    WHERE BS.SALES_DATE LIKE '2022-01%'
    GROUP BY A.AUTHOR_NAME, B.CATEGORY
    ORDER BY B.AUTHOR_ID, B.CATEGORY DESC