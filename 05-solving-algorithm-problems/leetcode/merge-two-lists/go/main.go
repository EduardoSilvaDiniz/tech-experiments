func romanToInt(s string) int {
	result := 0
	hashRoman := map[string]int{
		"I": 1,
		"V": 5,
		"X": 10,
		"L": 50,
		"C": 100,
		"D": 500,
		"M": 1000,
	}

	for i, v := range s {
		result += hashRoman[string(v)]
		if i != 0 {
			if hashRoman[string(s[i-1])] < hashRoman[string(v)]{
				result -= 2 * hashRoman[string(s[i-1])]
			}
		}
	}
	return result;
}
