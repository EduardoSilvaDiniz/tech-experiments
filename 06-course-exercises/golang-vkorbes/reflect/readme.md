# Metaprogramação em Go

**Metaprogramação** é o ato de escrever código que entende e opera sobre seu próprio código — ou sobre suas informações estruturais, como tipos, campos, métodos e anotações.

---

## 🔍 reflect

`reflect` é uma biblioteca da *standard library* do Go que permite inspecionar e manipular tipos e valores **em tempo de execução (runtime)**.  
É a **única forma nativa de metaprogramação** disponível na linguagem.

Apesar de ser uma ferramenta poderosa, o uso de `reflect` deve ser feito com cautela, pois:

- Introduz complexidade e pode dificultar a leitura e manutenção do código
- Impede o uso de validações de tipo em tempo de compilação
- Torna erros mais difíceis de detectar

---

## 💡 Exemplo prático

Um uso comum é a **validação de structs com base em tags personalizadas**, similar ao que a biblioteca `encoding/json` faz ao mapear campos para JSON.

Por exemplo, você pode definir uma tag `required:"true"` em um campo da struct e usar `reflect` para verificar se os campos obrigatórios foram preenchidos.

---

## ⚠️ Recomendações

Use `reflect` apenas quando **não houver alternativas mais simples ou idiomáticas**.

- ✅ Bom uso: verificar se todos os campos obrigatórios de uma struct estão preenchidos antes de gravar no banco.
- ❌ Mau uso: modificar dados arbitrariamente em tempo de execução — isso torna o código imprevisível e frágil.

> **Dica**: pense em `reflect` como uma ferramenta de *análise*, e não de *modificação*.  
> Sempre que possível, mantenha o comportamento explícito e tipado.

---

## 📎 Referência

- [reflect package - pkg.go.dev](https://pkg.go.dev/reflect)
- [aprenda golang - aprendagolang.com.br](https://aprendagolang.com.br/por-que-evitar-o-package-reflect/)

