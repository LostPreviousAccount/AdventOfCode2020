;gnu clisp  2.49.60

;(print "Hello, world!")

(defun test1 (lst) ; affiche 1er element de la liste car car = head et cdr = tail
    (print (car lst)))

(defun test2 (lst) ; affiche liste puis cdr de liste etc...
    (maplist (lambda (l) (print l)) lst)) ; maplist = map sur chaque cdr de liste en partant de la liste entièrement

(defun test3 (e lst) ; affiche combinaisons de e et chaque element de la liste
    (mapcar (lambda (h) (list e h)) lst))

;(print (test3 5 (list 42 2 3)))

(defun combi_2 (lst) ; retourne une liste de combinaison de paires
    (mapcon (lambda (l) (test3 (car l) (cdr l))) lst))

;(print (combi_2 (list 1 2 3 4)))

(defun filter (f list) ; https://wiki.c2.com/?FilterFunction
   (cond
    ((not list)                   ;; the list is empty
     nil)
    ((funcall f (first list))     ;; the first element satisfies the test
     (cons (first list) (filter f (rest list))))
    (t                            ;; otherwise ...
     (filter f (rest list)))))

(defun find_first (f list) ; tentative d'amélioration de perf car utiliser filter provoque un stack overflow
    (cond
    ((not list)                   ;; the list is empty
     nil)
    ((funcall f (first list))     ;; the first element satisfies the test
     (first list))
    (t                            ;; otherwise ...
     (find_first f (rest list)))))

(defun check_sum_2020 (e lst) ; nouvelle tentative d'amélioration de perf car find_first provoque aussi un stack overflow
    (mapcan (lambda (h) (
     cond
     ((= 2020 (+ e h))
      (list e h))
     (t
      nil))) lst))

(defun combi_2_perf (lst) ; retourne une liste de combinaison de paires dont somme = 2020
    (mapcon (lambda (l) (check_sum_2020 (car l) (cdr l))) lst))

;(print (combi_2_perf '(1721 979 366 299 675 1456)))

(defun solution (lst)
    (reduce '* lst))

(defun advent_1_1 (lst)
    (print (solution (combi_2_perf lst))))

;(advent_1_1 (list 1721 979 366 299 675 1456))

;input énoncé
(setq input '(2000 50 1984 1600 1736 1572 2010 1559 1999 1764 1808 1745 1343 1495 1860 1977 1981 1640 1966 1961 1978 1719 1930 535 1804 1535 1507 1284 1618 1991 1589 1593 1960 1953 1963 1697 1741 1823 1932 1789 1822 1972 1570 1651 1800 1514 726 1567 72 1987 1791 1842 1020 1541 1383 1505 2009 1925 13 1973 1599 1632 1905 1626 1554 1913 1890 1583 1513 1828 187 1616 1508 1524 1613 1648 32 1612 1992 1671 1955 1943 1936 1870 1629 1493 1770 1699 1990 1658 1592 1596 1888 1540 239 1677 1602 1877 1481 2004 1985 1829 1980 2008 1964 897 1843 1750 1969 1790 1989 1606 1484 1983 1986 1501 1511 1543 1869 1051 1810 1716 1633 1850 1500 1120 1849 1941 1403 1515 1915 1862 2002 1952 1893 1494 1610 1797 1908 1534 1979 2006 1971 1993 1432 1547 1488 1642 1982 1666 1856 1889 1691 1976 1962 2005 1611 1665 1816 1880 1896 1552 1809 1844 1553 1841 1785 1968 1491 1498 1995 1748 1533 1988 2001 1917 1788 1537 1659 1574 1724 1997 923 1476 1763 1817 1998 1848 1974 1830 1672 1861 1652 1551 1363 1645 1996 1965 1967 1778))

;(advent_1_1 input)

(defun tuple_3 (e1 e2 lst)
    (mapcan (lambda (l)
        (cond
        ((= 2020 (+ e1 e2 l))
         (list e1 e2 l))
        (t
         nil))) lst))

(defun combi_3_sub (e lst)
    (mapcon (lambda (l) (tuple_3 e (first l) (rest l))) lst))

(defun combi_3 (lst)
    (mapcon (lambda (l) (combi_3_sub (first l) (rest l))) lst))

;(print (combi_3 '(1721 979 366 299 675 1456)))

(defun advent_1_2 (lst)
    (print (solution (combi_3 lst))))

;(advent_1_2 '(1721 979 366 299 675 1456))

;(advent_1_2 input)
