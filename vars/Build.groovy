#!/usr/bin/env groovy

import nico.shared.build.BuildUtils;

def call(context) {
    def build = new BuildUtils();
    build.build(context);
}
