ROSE:  Repairing Obvious Semantic Errors

This package is an attempt to add to IDEs a tool that can suggest appropriate
repairs during a debugging session.  It essentially implements a QuickFix for
semantic errors.

Before compiling and installing ROSE, one should first install all the dependencies, which are IVY, Code Bubbles,
FAIT (and FAITBB, KARMA, and FREDIT), and SEEDE (and SEEDEBB).	All of these
should share the same parent directory and all should be compiled (successfully)
before attempting to install ROSE.

* Links:
    * IVY: https://github.com/StevenReiss/ivy
    * Code Bubbles: https://github.com/StevenReiss/bubbles
    * FAIT: https://github.com/StevenReiss/fait
    * FAITBB: https://github.com/StevenReiss/faitbb
    * KARMA: https://github.com/StevenReiss/karma
    * FREDIT:https://github.com/StevenReiss/fredit
    * SEEDE: https://github.com/StevenReiss/seede
    * SEEDEBB: https://github.com/StevenReiss/seedebb

Once ROSE has been cloned, and the above packages have been successfully
installed and compiled, ROSE can be built by running ant in the top level
directory.  This will compile everything and install ROSE as a code bubbles
plugin.  Note that for development, the individual packages (source subdirectories)
can be compiled separately by running ant in the subdirectory.

