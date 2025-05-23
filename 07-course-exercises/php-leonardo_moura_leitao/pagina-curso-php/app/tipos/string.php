<div class="titulo">Tipo String</div>

<?php
echo 'Eu sou uma string';
echo '<br>';

var_dump("Eu Também"); // caracteres especiais tambem conta como uma string
echo '<br>';

// concatenação
echo 'nós tambem' . ' somos!'; // em php, para juntar duas string, usa ponto (.)
echo '<br>', 'também aceito'
           , ' virgulas!'; // tambem é possivel usar virgula (,)

echo '<br>';

echo "teste" . ' test';

print("<br>tambem existe a função print!");
echo '<br>';

echo strtoupper('maximizado');
echo '<br>';
echo strtolower('MINIMIZADO');
echo '<br>';
echo ucfirst("só a primeira letra");
echo '<br>';
echo ucwords("todas as palavras");
echo '<br>';
echo strlen("quantas letras?");
echo '<br>';
echo mb_strlen("em tambem", "utf-8");
echo '<br>';
echo substr("só uma parte da frase", 7,6);
echo '<br>';
echo str_replace("isso", 'aquilo', 'trocar por isso');