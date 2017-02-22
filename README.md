# PAPLJ in Xtext
An Xtext implementation of the PAPLJ language, a simplified Java dialect for teaching Principles of Programming Languages.


## Build and Run
First, in the grammar editor in the development Eclipse instance:

1. right-click the grammar editor;
2. select _Run As_ → _Generate Xtext Artifacts_.

### Eclipse
To run an Eclipse instance with PAPLJ:

1. right-click the main project;
2. select _Run As_ → _Eclipse Application_ to launch the Eclipse instance;
3. create a new _Plug-in Project_;
4. in the `MANIFEST.MF`, add `org.metaborg.paplj` to the _Required Plug-ins_ dependencies;
4. in the `src` directory, create a new file ending with the `.pj` extension;
5. if asked, confirm the conversion to an Xtext project.

### IntelliJ
To run an IntelliJ instance with PAPLJ:

> **Note**: This doesn't currently work as no IntelliJ plugin has been released for Xtext 2.11.

1. open the _Gradle Tasks_ view via _Window_ → _Show view_ → _Other..._ → _Gradle_ → _Gradle Tasks_;
2. expand the `org.metaborg.paplj.parent` project;
3. double-click the `intellij idea/runIdea` task to launch the IntelliJ instance;
4. create a new Java project - it doesn't need a JDK;
5. in the `src` directory, create a new file ending with the `.pj` extension.

### Web Editor
To run the Web Editor with PAPLJ:

1. open the _Gradle Tasks_ view via _Window_ → _Show view_ → _Other..._ → _Gradle_ → _Gradle Tasks_;
2. expand the `org.metaborg.paplj.parent` project;
3. double-click the `run/jettyRun` task to launch the Jetty server;
4. open the URL shown in the _Console_ view.


## Layout
The workspace consists of the following projects:

- `org.metaborg.paplj.parent` — Aggregator build so all modules can be built with one Maven command.
- `org.metaborg.paplj` — The grammar definition and all languge-specific components.
- `org.metaborg.paplj.tests` — Unit-tests for the language.
- `org.metaborg.paplj.ide` — Platform-independent IDE functionality.
- `org.metaborg.paplj.idea` — IntelliJ IDEA functionality.
- `org.metaborg.paplj.ui` — Eclipse functionality.
- `org.metaborg.paplj.ui.tests` — Eclipse unit-tests.
- `org.metaborg.paplj.target` — Eclipse target platform definition against which to build.
- `org.metaborg.paplj.web` — Web functionality.


## Editing

### Guillemets
To get the guillemets used in Xtend files (that is, `«` and `»`), in the Eclipse editor press Ctrl+Shift+<, Ctrl+Shift+> (or on Mac Cmd instead of Ctrl).
