<div class="titulo">Olá PHP</div>

<h2>Exemplo A</h2>
<?php
echo "olá";
echo "<br>"; // quebra de linha formato html, em linha de comando é \n
echo "wolrd!";
?>

<h2>Exemplo B</h2>
<?= "Outra forma de em 'expressar'!" ?>
<?= "<br>" ?>

<?php
phpinfo(); // não é necessario fechar, caso seja no final do arquivo
