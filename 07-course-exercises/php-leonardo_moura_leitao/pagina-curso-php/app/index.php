<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <link href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700" rel="stylesheet">
  <link rel="stylesheet" href="assets/css/style.css">
  <title>Curso PHP</title>
</head>

<body>
  <header class="cabecalho">
    <h1>Curso PHP</h1>
    <h2>Índice dos Exercícios</h2>
  </header>
  <main class="principal">
    <div class="conteudo">
      <nav class="modulos">
        <div class="modulo verde">
          <h3>Módulo 01</h3>
          <ul>
            <li>
              <a href="exercicio.php?dir=basico&file=ola">
                Olá PHP
              </a>
            </li>
            <li>
              <a href="exercicio.php?dir=basico&file=html">
                Integração com HTML
              </a>
            </li>
            <li>
              <a href="exercicio.php?dir=basico&file=css">
                Css
              </a>
            </li>
            <li>
              <a href="exercicio.php?dir=basico&file=comentarios">
                Comentarios
              </a>
            </li>
            <li>
              <a href="exercicio.php?dir=basico&file=desafio">
                Desafio
              </a>
            </li>
          </ul>
        </div>
        <div class="modulo vermelho">
          <h3>Tipos</h3>
          <ul>
            <li>
              <a href="exercicio.php?dir=tipos&file=int">
                Inteiro
              </a>
            </li>
          </ul>
          <ul>
            <li>
              <a href="exercicio.php?dir=tipos&file=float">
                Float
              </a>
            </li>
          </ul>
          <ul>
            <li>
              <a href="exercicio.php?dir=tipos&file=aritmeticas">
                Op. Aritmeticas
              </a>
            </li>
          </ul>
          <ul>
            <li>
              <a href="exercicio.php?dir=tipos&file=desafioPrecedencia">
                Desafio Precedência
              </a>
            </li>
          </ul>
          <ul>
            <li>
              <a href="exercicio.php?dir=tipos&file=string">
                String
              </a>
            </li>
          </ul>
        </div>
      </nav>
    </div>
  </main>
  <footer class="rodape">
    COD3R & ALUNOS © <?= date('Y'); ?>
  </footer>
</body>

</html>
