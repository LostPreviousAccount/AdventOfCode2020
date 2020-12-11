//DMD64 D Compiler 2.091.0
// https://rextester.com/l/d_online_compiler

import std.stdio;
import std.string;
import std.algorithm;
import std.conv;
import std.array;

pure int solution1(string str) {
    int[] lines = splitLines(str).map!(a => to!int(a)).array; //convert input to array of int
    lines ~= 0; // add start jolt
    lines = lines.sort.array;
    lines ~= lines[lines.length-1] + 3; // add last built-in adapter jolt
    // writeln(lines);
    int[int] jolt_diffs = [
      1: 0,
      3: 0
    ];
    for (size_t i = 0; i < lines.length-1; i++) {
        auto diff = lines[i+1] - lines[i];
        jolt_diffs[diff] += 1;
    }
    return jolt_diffs[1] * jolt_diffs[3];
}

int combi(int j) {
    if (j < 1)
        return 1;
    // write(j);write(" | ");write((j)*(j+1)/2 +1);write(" -> ");
    return j *(j+1) /2 +1;
}

long solution2(string str) {
    int[] lines = splitLines(str).map!(a => to!int(a)).array; //convert input to array of int
    lines ~= 0; // add start jolt
    lines = lines.sort.array;
    lines ~= lines[lines.length-1] + 3; // add last built-in adapter jolt
    //writeln(lines);
    long res = 1;
    int tores = 0;
    for (size_t i = 0; i < lines.length-1; i++) {
        auto diff = lines[i+1] - lines[i];
        //write(lines[i+1]);write(" - ");writeln(lines[i]);
        if (diff == 1) {
            tores += 1;
        } else {
            tores -= 1;            
            res *= combi(tores);
            //writeln(res);
            tores = 0;
        }
    }
    return res;
}

void main()
{
    auto ex1 = "16
10
15
5
1
11
7
19
6
12
4";
    auto ex2= "28
33
18
42
31
14
46
20
48
47
24
23
49
45
19
38
39
11
1
32
25
35
8
17
7
9
4
2
34
10
3";
    auto input = "149
87
67
45
76
29
107
88
4
11
118
160
20
115
130
91
144
152
33
94
53
148
138
47
104
121
112
116
99
105
34
14
44
137
52
2
65
141
140
86
84
81
124
62
15
68
147
27
106
28
69
163
97
111
162
17
159
122
156
127
46
35
128
123
48
38
129
161
3
24
60
58
155
22
55
75
16
8
78
134
30
61
72
54
41
1
59
101
10
85
139
9
98
21
108
117
131
66
23
77
7
100
51";
auto ex3 = "4
11
7
8
1
6
5";
    //writeln(solution1(input)); 
    //writeln(solution2(input));
}
