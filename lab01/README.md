## Java
I am running Java SE Developer Kit 16
```
java 16.0.1 2021-04-20
Java(TM) SE Runtime Environment (build 16.0.1+9-24)
Java HotSpot(TM) 64-Bit Server VM (build 16.0.1+9-24, mixed mode, sharing)
```

To run the java program (in newmath_java), first compile it
```
javac -encoding UTF-8 --source-path src -d dist src/*.java
```

Then run it
```
java -cp ./dist Main
```

An output of the running program:
```
Newmath (type 'exit' to exit program)
Numerator: 25
Demoninator: 5
25 / 5 = 5
Numerator: exit
```

Screenshot from terminal:

![newmath_java_screenshot](https://user-images.githubusercontent.com/55165979/118371601-4ea56880-b57b-11eb-9f44-33df75c7cb24.png)

## JUnit
I am working with JUnit5 (via Console standalone 1.7.1)
To run JUnit, compile the application, then compile the test code

```
javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```

Then run the Tests
```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

Output of the tests:
```
Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  └─ NewmathTest ✔
│     ├─ div_ok() ✔
│     └─ div_by_zero() ✔
└─ JUnit Vintage ✔

Test run finished after 80 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         2 tests found           ]
[         0 tests skipped         ]
[         2 tests started         ]
[         0 tests aborted         ]
[         2 tests successful      ]
[         0 tests failed          ]
```

Screenshot of the terminal:

![junit_screenshot](https://user-images.githubusercontent.com/55165979/118371590-40574c80-b57b-11eb-8da0-4bce6e99de86.png)

## Elixir
I am running Elixir 11.4 with Erlang 23
```
elixir --version   
Erlang/OTP 23 [erts-11.2.2] [source] [64-bit] [smp:8:8] [ds:8:8:10] [async-threads:1] [hipe] [dtrace]

Elixir 1.11.4 (compiled with Erlang/OTP 23)
```

First compile Elixir program (in newmath_ex)
```
mix compile
```

Then run it
```
iex -S mix
```

Output of the running program:
```
iex(1)> NewmathEx.
MixProject    div/2         
iex(1)> NewmathEx.div(25,5)
{:ok, 5.0}
```

Screenshot from terminal:

![newmath_ex_screenshot](https://user-images.githubusercontent.com/55165979/118371612-5b29c100-b57b-11eb-9424-edb0c89ce5fc.png)

## ExUnit
Compile exactly like Elixir `mix compile`

To run the tests
```
mix test
```

Output of the tests:
```
Compiling 1 file (.ex)
Generated newmath_ex app
...

Finished in 0.04 seconds
1 doctest, 2 tests, 0 failures

Randomized with seed 233474
```

Screenshot of terminal:

![exunit_screenshot](https://user-images.githubusercontent.com/55165979/118371607-55cc7680-b57b-11eb-99fa-7fcceec3b577.png)

