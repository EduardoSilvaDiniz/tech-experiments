package internal

import "fmt"

type Node struct {
	Value int
	Next  *Node
}

func NewNode(value int) *Node {
	return &Node{
		Value: value,
		Next:  nil,
	}
}

func (n *Node) InsertNode(value int) {
	newNode := NewNode(value)
	n.Next = newNode
}

func (n *Node) RemoveNode(value int) int {
	curr := n
	for curr != nil {
		if curr.Value == value {

			if curr.Next == nil {
				curr.Value = 0
				return value
			}

			curr.Value = curr.Next.Value
			curr.Next = curr.Next.Next
			return value
		}

		curr = curr.Next
	}
	fmt.Println("value not found")
	return -1
}
