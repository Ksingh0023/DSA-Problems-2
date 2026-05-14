class Solution {
public:
    string countAndSay(int n) {
        
        string s = "1";

        while (--n) {

            string temp = "";

            for (int i = 0; i < s.size(); ) {

                int j = i;

                while (j < s.size() && s[i] == s[j])
                    j++;

                temp += to_string(j - i) + s[i];
                i = j;
            }

            s = temp;
        }

        return s;
    }
};
