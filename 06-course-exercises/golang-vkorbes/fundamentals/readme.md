# Fundamentos do Golang

Este documento reúne alguns conceitos fundamentais da linguagem Go.

---
## `defer`

O comando `defer` adia a execução de uma função até o momento em que a função em que ele está termine.

```go
func main(){
    defer fmt.Println("terminou")
    ...
    ...
    ...
    ...
    return 0
}

```
Nesse exemplo, o Println só será executado após o final da função main.

--- 

## `any... (variadic functions)`

Em Go, é possível indicar que uma função pode receber vários argumentos do mesmo tipo utilizando `...`.

```go
func sum(nums ...int) int {
    total := 0
    for _, n := range nums {
        total += n
    }
    return total
}

func main() {
    fmt.Println(sum(1, 2, 3, 4, 5))
}
```

Também é possível passar uma slice:
```go
    valores := []int{1, 2, 3}
    sum(valores...)
```

---

## `panic e recover`

- `panic` é uma função que interrompe a execução da aplicação, derrubando toda a pilha de chamadas (stack).
- `recover` é usado para capturar um `panic` e tentar recuperar a execução, evitando que a aplicação seja encerrada abruptamente.

```go
func main() {
    defer func() {
        if r := recover(); r != nil {
            fmt.Println("Erro recuperado:", r)
        }
    }()
    
    panic("Algo deu errado")
}
```

Importante: `recover` só funciona dentro de uma função `defer`. Isso significa que ele será chamado após o `panic`, podendo evitar a queda total da aplicação — mas pode deixá-la em um estado inconsistente.

⚠️ Por isso, prefira sempre usar `error` para tratamento de falhas. Reserve `panic/recover` para erros realmente inesperados ou fatais.
