/*
 * Copyright (C) 2014-2016 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */
package gobblin.data.management.convertion.hive;

import org.apache.hadoop.hive.ql.metadata.Partition;
import org.apache.hadoop.hive.ql.metadata.Table;

/**
 * An interface to read previous high watermarks and write new high watermarks to state.
 */
public interface HiveSourceWatermarker {

  /**
   * Get high watermark from previous execution for a {@link Table}
   */
  public LongWatermark getPreviousHighWatermark(Table table);

  /**
   * Get high watermark from previous execution for a {@link Partition}
   */
  public LongWatermark getPreviousHighWatermark(Partition partition);

}
