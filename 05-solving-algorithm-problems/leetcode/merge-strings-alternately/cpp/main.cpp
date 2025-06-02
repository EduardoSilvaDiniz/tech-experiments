#include <iostream>

using namespace std;

class Solution 
{
  public:
    string mergeAlternately(string word1, string word2)
    {
      char marge[word1.size()+word2.size()];
      for (int i = 0; i < word1.size(); i++) {
        for (int a = 0; a < word2.size(); a++) {
          merge[]
        }
        marge[i] = word1[i];
      }
    }

    int checkPosi(char letra)
    {
      int i = 1;
      for (char letraAlfa : this->alfabeto) 
      {
        if (letraAlfa == letra) return i;
        i++;
      }
      return -1;
    }
  private:
    char alfabeto[50] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                         'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
                         'u', 'v', 'w', 'x', 'y', 'z'};
};


int main(int argc, char *argv[])
{
  Solution* sol = new Solution();
  std::cout << sol->mergeAlternately("abc", "pqr") << std::endl;
  return 0;
}
