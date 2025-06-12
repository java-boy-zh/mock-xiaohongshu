package io.github.zh.kv.server.mapper;

import io.github.zh.kv.server.domain.dataobject.NoteContentDO;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

/**
 * NoteContentMapper
 *
 * @author 王青玄
 * @version v0.1 2025-06-12 17:03
 */
public interface NoteContentMapper extends CassandraRepository<NoteContentDO, UUID> {

}