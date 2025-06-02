<div class="titulo">Operações Aritméticas</div>

<?php 
echo 1+1, '<br>';
echo 2 * 5, '<br>';

echo 7/4,'<br>';

echo intdiv(7, 4), '<br>'; // retorna inteiro 

echo round(7/4), '<br>'; // arredonda
echo 7%4, '<br>';

echo 7 / 0, '<br>'; // resultado indefinido retornra INF(infinite)

#echo intdiv(7, 0); // erro
echo 3 ** 2, '<br>'; // elevado a... 

// precedencia de operacoes
// () => ** => / * % => + -

echo 2 + 3 * 4 ** 2, '<br>'; // ordem ((4 ** 2) * 2) + (3 + 2)