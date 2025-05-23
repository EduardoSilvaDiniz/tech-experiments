package unit

import (
	"bytes"
	"testing"

	"go-tricks/internal"
)

func TestCotagem(t *testing.T) {
	buffer := &bytes.Buffer{}

	internal.Contagem(buffer)

	result := buffer.String()
	esperado := `3
2
1
Vai!`

	if result != esperado {
		t.Errorf("resultado '%s', esperado '%s'", result, esperado)
	}
}
