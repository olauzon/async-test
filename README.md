# async-test

Trying to reproduce an issue with core.async versions

## Usage

Comment in one of the core.async dependencies in `project.clj` and do

```
lein run
```

You will either see some HTML, or a compilation error that looks like
this:

```
Exception in thread "main" java.lang.IllegalArgumentException: Can't
define method not in interfaces: closed_QMARK_,
compiling:(clojure/core/async/impl/channels.clj:31:1)
at clojure.lang.Compiler.analyzeSeq(Compiler.java:6651)
at clojure.lang.Compiler.analyze(Compiler.java:6445)
at clojure.lang.Compiler.analyze(Compiler.java:java6406)
at clojure.lang.Compiler$BodyExpr$Parser.parse(Compiler.java:5782)
at clojure.lang.Compiler$LetExpr$Parser.parse(Compiler.java:6100)
    at clojure.lang.Compiler.analyzeSeq(Compiler.java:6644)
    at clojure.lang.Compiler.analyze(Compiler.java:6445)
    at clojure.lang.Compiler.analyze(Compiler.java:6406)
    at clojure.lang.Compiler$BodyExpr$Parser.parse(Compiler$BodyExpr$Parserompiler.java:5782)
    at clojure.lang.Compiler$FnMethod.parse(Compiler.java:5217)
    at clojure.lang.Compiler$FnExpr.parse(Compiler.java:3846)
    at clojure.lang.Compiler.analyzeSeq(Compiler.java:6642)
    at clojure.lang.Compiler.analyze(Compiler.java:6445)
    at clojure.lang.Compiler.eval(Compilerpiler.java:6700)
    at clojure.lang.Compiler.load(Compiler.java:7130)
    at clojure.lang.RT.loadResourceScript(RT.java:370)
    at clojure.lang.RT.loadResourceScript(RT.java:361)
    at clojure.lang.RT.load(RT.java:440)
    at clojure.lang.RT.load(RT.java:411)
    at clojure.core$load$fn__5066.invoke(core.clj:5641)
    at clojure.core$load.doInvoke(core.clj:5640)
    at clojure.lang.RestFn.invoke(RestFn.java:408)
    at clojure.core$load_one.invoke(core.clj:5446)
    at clojure.core$load_lib$fn__5015.invoke(core.clj:5486)
    at clojure.core$load_lib.doInvoke(core.clj:5485)
    at clojure.lang.RestFn.applyTo(RestFn.java:142)
    at clojure.core$apply.invoke(core.clj:670026)
    at clojure.core$load_libs.doInvoke(core.clj:5524)
    at clojure.lang.RestFn.applyTo(RestFn.java:137)
    at clojure.core$apply.invoke(core.clj:626)
    at clojure.core$require.doInvoke(core.clj:5607)
    at clojure.lang.RestFn.invoke(RestFn.java:619)
    at clojure.core.async$eval26$loading__4958__auto____27.invoke(async.clj:9)
    at clojure.core.async$eval26.invoke(async.clj:9)
    at clojure.lang.Compiler.eval(Compiler.java:6703)
    at clojure.lang.Compiler.eval(Compiler.java:6692)
    at clojure.lang.Compiler.load(Compiler.java:7130)
    at clojure.lang.RT.loadResourceScript(RT.java:370)
    at clojure.lang.RT.loadResourceScript(RT.java:361)
    at clojure.lang.RT.load(RT.java:440)
    at clojure.lang.RT.load(RT.java:411)
    at cljojure.core$load$fn__5066.invoke(core.clj:5641)
    at clojure.core$load.doInvoke(core.clj:5640)
    at clojure.lang.RestFn.invoke(RestFn.java:408)
    at clojure.core$load_one.invoke(core.clj:5446)
    at clojure.core$load_libsb$fn__5015.invoke(core.clj:5486)
    at clojure.core$load_lib.doInvoke(core$load_libe.clj:5485)
    at clojure.lang.RestFn.applyTo(RestFn.java:142)
    at clojure.core$apply.invoke(core.clj:626)
    at clojure.core$load_libs.doInvoke(core$load_libsore.clj:5524)
    at clojure.lang.RestFn.applyTo(RestFn.java:137)
    at clojure.core$apply.invoke(core.clj:626)
    at clojure.core$require.doInvoke(core$requireore.clj:5607)
    at clojure.lang.RestFn.invoke(RestFn.java:421)
    at async$eval26.core$eval20$loading__4958__auto____21.invoke(core.clj:1)
    at async.core$eval20.invoke(core.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:6703)
    at clojure.lang.Compiler.eval(Compiler.java:6692)
    at clojure.lang.Compiler.load(Compiler.java:7130)
    at clojure.lang.RT.loadResourceScript(RT.java:370)
    at clojure.lang.RT.loadResourceScript(RT.java:361)361
    at clojure.lang.RT.load(RT.java:440)
    at clojure.lang.RT.load(RT.java:411)
    at clojure.core$load$fn__5066.invoke(core.clj:5641)
    at clojure.core$load.doInvoke(core.clj:5640)
    at clojure.lang.RestFn.invoke(RestFn.java:408)
    at clojure.core$load_one.invoke(core.clj:5446)
    at clojure.core$load_lib$fn__5015.invoke(core.clj:5486)
    at clojure.core$load_lib.doInvoke(core.clj:5485)
    at clojure.lang.RestFn.applyTo(RestFn.java:142)
    at clojure.core$apply.invoke(core.clj:626)
    at clojure.core$load_lib$fn__5015s.doInvoke(core.clj:5524)
    at clojure.lang.RestFn.applyTo(RestFn.java:14237)
    at clojure.core$apply.invoke(core.clj:626)
    at clojure.core$requiree.doInvoke(core.clj:5607)
    at clojure.lang.RestFn.invoke(RestFn.java:4088)
    at user$eval5$fn__7.invoke(form-init4970763338827618216.clj:1)
    at user$eval5.invoke(form-init4970763338827618216.clj:1)
    at clojure.lang.Compiler.eval(Compiler.java:6703)
    at clojure.lang.Compiler.eval(Compilerer.java:6693)
    at clojure.lang.Compiler.load(Compiler.java:7130)
    at cljojure.lang.Compiler.loadFile(Compiler.java:7086)
    at clojure.main$load_script.invoke(main.clj:274)
    at clojure.main$init_opt.invoke(main.clj:27479)
    at clojure.main$initialize.invoke(main.clj:307)
    at clojure.main$null_opt.invoke(main.clj:342)
    at clojure.main$main.doInvoke(main.clj:4210)
    at clojure.lang.RestFn.invoke(RestFn.java:421)
    at clojure.lang.Var.invoke(Var.java:383)
    at clojure.lang.AFn.applyToHelper(AFn.java:156)
    at clojure.lang.Var.applyTo(Var.java:700)
    at clojure.main.main(main.java:37)
    Caused by: java.lang.IllegalArgumentException: Can't define method not in interfaces: closed_QMARK_
    at clojure.lang.Compiler$NewInstanceMethod.parse(Compiler.java:7984)
    at clojure.lang.Compiler$NewInstanceExpr.build(Compiler.java:7544)
    at clojure.lang.Compiler$NewInstanceExpr$DeftypeParser.parse(Compiler.java:7425)
    at clojure.lang.Compiler.analyzeSeq(Compiler.java:6644)
    ... 91 more
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
