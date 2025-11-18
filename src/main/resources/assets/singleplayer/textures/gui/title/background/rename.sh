#!/usr/bin/env bash

# Just something I threw together to make my life easier. Maybe one day I'll make it good.

# Source - https://stackoverflow.com/a
SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

read -rp "Enter filename: " filename

for count in $(seq 0 5); do
  i="$SCRIPT_DIR/$filename.png"

  oldname="$(echo "$i" | cut -d'.' -f1)"
  newname=$oldname"_"$count

  cp -i "$i" "$newname"".png"
  echo "$count"
done;