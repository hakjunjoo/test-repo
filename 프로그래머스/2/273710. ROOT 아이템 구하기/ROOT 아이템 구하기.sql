-- 코드를 작성해주세요
SELECT II.ITEM_ID, II.ITEM_NAME FROM ITEM_INFO II
 LEFT JOIN ITEM_TREE IT ON II.ITEM_ID = IT.ITEM_ID
 WHERE IT.PARENT_ITEM_ID IS NULL
 ORDER BY 1