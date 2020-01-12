#!/usr/bin/env bash

# The above line should actually just be- "#!/bin/bash" if outside IntelliJ-IDEA IDE.
a=10
b=10
if [[ $a -eq $b ]]; then
    echo "Equal"
else
    echo "Not Equal"
fi

sleep 10
