A [Giter8][g8] template for a Minecraft Spigot plugin in 100% Scala.

---
## why?
i'm not doing any of this in java

## How do I use it?
Instantiate the project with sbt;
```
$ sbt new KrisRalph/spigot-plugin.g8
```

Uses Mill as a build tool, so after filling the template out:
```
$ mill mycoolproject.compile
$ mill mycoolproject.assembly # Produces a fat jar under out/mycoolproject/assembly/dest/out.jar
```

Unfortunately the path to the spigot jar is currently hardcoded in build.sc.
Really not sure why I couldn't add it the usual way as an ivy dependency.

Remember that the plugin won't actually load until you edit resources/plugin.yml and fill that out.

Happy hacking!

[g8]: http://www.foundweekends.org/giter8/
