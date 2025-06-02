package unit

import (
	"pointer/internal"
	"testing"
)

func TestCreateNode(t *testing.T) {
	resultado := internal.NewNode(1)
	esperado := 1

	if resultado.Value != esperado {
		t.Errorf("esperado: %v, recebido: %v", esperado, resultado.Value)
	}
}

func TestLinkedNodes(t *testing.T) {
	esperado := 2

	resultado := internal.NewNode(1)
	resultado.InsertNode(esperado)

	if resultado.Next.Value != esperado {
		t.Errorf("esperado: %v, recebido: %v", esperado, resultado.Next.Value)
	}
}

func TestRemoveNode(t *testing.T) {
	esperado := 2

	resultado := internal.NewNode(1)
	resultado.InsertNode(esperado)

	if resultado.RemoveNode(2) != esperado {
		t.Errorf("esperado: %v, recebido: %v", esperado, resultado.Next.Value)
	}

	if resultado.Next.Value != 0 {
		t.Errorf("esperado: %v, recebido: %v", 0, resultado.Next.Value)
	}
}
