#!/bin/bash

apt update
apt install -y --no-install-recommends python3-pip
python3 -V
pip3 -V
find /io/generated/dist/wheelhouse/ -name "*.whl" -exec pip3 install {} \;
python3 -c "from libamtrack import libAT; a = libAT.AT_lambda_Landau_Mode(); print(a);"