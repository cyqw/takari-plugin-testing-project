/**
 * Copyright (c) 2021 Takari, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.takari.maven.testing.executor.junit;

final class MavenVersionDisplayNameFormatter {

  private final String displayName;

  MavenVersionDisplayNameFormatter(String displayName) {
    this.displayName = displayName;
  }

  String format(String mavenVersion) {
    return this.displayName + '[' + mavenVersion + ']';
  }
  
}
